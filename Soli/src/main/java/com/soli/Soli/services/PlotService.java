package com.soli.Soli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soli.Soli.models.Plot;
import com.soli.Soli.models.Polygon;
import com.soli.Soli.repositories.PlotRepository;

@Service
public class PlotService {

	@Autowired
	private PlotRepository plotRepository;
	
	public Plot createPlot(Plot plot) {

		plot.setPolygon(new Polygon());
		plotRepository.save(plot);

		return plot;
	}
}
