package com.iisergii.phonecallzadarma.call;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CallController {
    @PostMapping("/v1/call")
    public PhoneCall StartCall(@RequestBody String settings) {
        return new PhoneCall("ID", "Charlie1");
    }

    @GetMapping("/v1/call/{callId}")
    public PhoneCall GetCall( @PathVariable UUID callId) {
        return new PhoneCall("ID", "Charlie2");
    }

    @GetMapping("/v1/call/{callId}/logs")
    public List<String> Logs(@PathVariable UUID callId) {
        ArrayList<String> res= new ArrayList<String>();
        res.add("sasf");
        res.add("asdfsadf");
        res.add(callId.toString());
        return res;
    }

    @GetMapping("/v1/call/{callId}/media")
    public PhoneCall Media( @PathVariable UUID callId) {
        return new PhoneCall("ID", "Charlie4");
    }

    @PostMapping("/v1/call/{callId}/close")
    public PhoneCall EndCall(@PathVariable UUID callId, @RequestBody String settings) {
        return new PhoneCall("ID", "Charlie5");
    }
}