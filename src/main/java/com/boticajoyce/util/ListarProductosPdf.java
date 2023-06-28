package com.boticajoyce.util;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.boticajoyce.entity.ProductoEntity;
import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/exportarProductos")
public class ListarProductosPdf extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<ProductoEntity> productos = (List<ProductoEntity>) model.get("productos");
		
		document.setPageSize(PageSize.A4);
		document.open();
		
		PdfPTable tablaTitulo = new PdfPTable(1);
		PdfPCell celda = null;
		celda = new PdfPCell(new Phrase("LISTADO DE PRODUCTOS - BOTICA JOYCE"));
		
		tablaTitulo.addCell(celda);
		tablaTitulo.setSpacingAfter(30);
		document.add(tablaTitulo);
		
		PdfPTable tablaCampos = new PdfPTable(9);
		PdfPCell celdaCodigo = new PdfPCell(new Phrase("ID"));
		PdfPCell celdaNombre = new PdfPCell(new Phrase("NOMBRE"));
		PdfPCell celdaCat = new PdfPCell(new Phrase("CATEGORIA"));
		PdfPCell celdaLab = new PdfPCell(new Phrase("LABORATORIO"));
		PdfPCell celdaIfa = new PdfPCell(new Phrase("IFA"));
		PdfPCell celdaStock = new PdfPCell(new Phrase("STOCK"));
		PdfPCell celdaPrecioU = new PdfPCell(new Phrase("PRECIO UNIT."));
		PdfPCell celdaPrecioE = new PdfPCell(new Phrase("PRECIO EMP."));
		PdfPCell celdaFecha = new PdfPCell(new Phrase("FECHA VENC."));
		
		tablaCampos.addCell(celdaCodigo);
		tablaCampos.addCell(celdaNombre);
		tablaCampos.addCell(celdaCat);
		tablaCampos.addCell(celdaLab);
		tablaCampos.addCell(celdaIfa);
		tablaCampos.addCell(celdaStock);
		tablaCampos.addCell(celdaPrecioU);
		tablaCampos.addCell(celdaPrecioE);
		tablaCampos.addCell(celdaFecha);
		document.add(tablaCampos);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		PdfPTable tablaMascotas = new PdfPTable(9);
		
		productos.forEach(producto ->{
			tablaMascotas.addCell(String.valueOf(producto.getId()));
			tablaMascotas.addCell(producto.getNombre());
			tablaMascotas.addCell(producto.getCategoria().getDescripcion());
			tablaMascotas.addCell(producto.getLaboratorio().getNombre_laboratorio());
			tablaMascotas.addCell(producto.getIfa().getNombre_ifa());
			tablaMascotas.addCell(String.valueOf(producto.getStock()));
			tablaMascotas.addCell(String.valueOf(producto.getPrecio_unidad()));
			tablaMascotas.addCell(String.valueOf(producto.getPrecio_empaq()));
			tablaMascotas.addCell(String.valueOf(sdf.format(producto.getFechacad())));
		});
		
		document.add(tablaMascotas);
	}

}
