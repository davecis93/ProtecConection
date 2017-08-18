package com.airsoftware.protec.protec.service.impl;

import com.airsoftware.protec.protec.model.Provider;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by areyna on 2/17/17.
 */
@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ProveedorServiceImpl.class);

    @Value("http://201.161.41.142/wsRemoto2/")
    public String PROTEC_ENDPOINT;

    @Value("cmVtb3RvOnIzbTB0MCp2Mg==")
    public String PROTEC_SECRET;


    public Provider obtenerDatosProovedor(Long idProveedor){

        Provider provider = new Provider();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
//            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, Long> map= new LinkedMultiValueMap<String, Long>();
            map.add("idProveedor", idProveedor);

            HttpEntity<MultiValueMap<String, Long>> request = new HttpEntity<MultiValueMap<String, Long>>(map, headers);

            ResponseEntity<String> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerDatosProveedor/", request , String.class );



//            HttpHeaders headers = new HttpHeaders();
//            String input = "{\"idProveedor\":\""+idProveedor+"\"}";
//
//            System.out.println(input);
//
//            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//            headers.set("Authorization", "Basic "+PROTEC_SECRET);
//
//            HttpEntity<String> entity = new HttpEntity<String>(input, headers);
//
//            ResponseEntity<Provider> proveedor = restTemplate.exchange(PROTEC_ENDPOINT + "obtenerDatosProveedor/", HttpMethod.POST, entity, Provider.class);

            System.out.println(response.getBody());
            // = response.getBody();



        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return provider;
    }

}
