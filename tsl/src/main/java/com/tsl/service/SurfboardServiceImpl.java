package com.tsl.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsl.exception.SurfboardNotFound;
import com.tsl.model.Surfboard;
import com.tsl.repository.SurfboardRepository;

@Service
public class SurfboardServiceImpl implements SurfboardService {  
	      
	    @Resource  
	    private SurfboardRepository surfboardRepository;  
	  
	    @Override  
	    @Transactional  
	    public Surfboard create(Surfboard surfboard) {  
	        Surfboard createdSurfboard = surfboard;  
	        return surfboardRepository.save(createdSurfboard);  
	    }  
	      
	    @Override  
	    @Transactional  
	    public Surfboard findById(int id) {  
	        return surfboardRepository.findOne(id);  
	    }  
	  
	    @Override  
	    @Transactional(rollbackFor=SurfboardNotFound.class)  
	    public Surfboard delete(int id) throws SurfboardNotFound {  
	        Surfboard deletedSurfboard = surfboardRepository.findOne(id);  
	          
	        if (deletedSurfboard == null)  
	            throw new SurfboardNotFound("No surfboard found to delete with id " + id);  
	          
	        surfboardRepository.delete(deletedSurfboard);  
	        return deletedSurfboard;  
	    }  
	  
	    @Override  
	    @Transactional  
	    public List<Surfboard> findAll() {  
	        return surfboardRepository.findAll();  
	    }  
	  
	    @Override  
	    @Transactional(rollbackFor=SurfboardNotFound.class)  
	    public Surfboard update(Surfboard surfboard) throws SurfboardNotFound { 
	    	
	    	if(surfboard == null || surfboard.getId() == null) {
	    		throw new SurfboardNotFound("No surfboard id - cannot update");
	    	}

	        Surfboard updatedSurfboard = surfboardRepository.findOne(surfboard.getId());  
	          
	        if (updatedSurfboard == null) {
	        	Exception ex = new SurfboardNotFound("No matching surfboard found to update");
	            throw new SurfboardNotFound("No matching surfboard found to update", ex);
	        }
	          
	        updatedSurfboard.setSurfboardname(surfboard.getSurfboardname());    
	        return updatedSurfboard;  
	    }  
	  
}
