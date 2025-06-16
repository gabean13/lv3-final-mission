package finalmission.member.service;

import org.springframework.stereotype.Component;

@Component
public class NameGeneratorImpl implements NameGenerator{

    @Override
    public String generate() {
        //TODO : name 연결
        return "random";
    }
}
