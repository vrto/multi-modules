package legacy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyWeb {

    private final LegacyService legacyService;

    @Autowired
    public LegacyWeb(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    @RequestMapping("/legacy")
    public String legacy() {
        return legacyService.doLegacyStuff();
    }
}
