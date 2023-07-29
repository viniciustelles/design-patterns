package br.com.design.patterns.chain;

class ZeroProcessor extends ValidatorProcessor {
    public ZeroProcessor(ValidatorProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}