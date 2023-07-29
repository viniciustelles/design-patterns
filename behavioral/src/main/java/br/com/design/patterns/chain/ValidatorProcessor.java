package br.com.design.patterns.chain;

import java.util.Objects;

public abstract class ValidatorProcessor {

    private ValidatorProcessor nextValidator;

    public ValidatorProcessor(ValidatorProcessor nextValidator) {
        this.nextValidator = nextValidator;
    }

    public void process(Number number) {
        if (Objects.nonNull(nextValidator)) {
            nextValidator.process(number);
        }
    }
}
