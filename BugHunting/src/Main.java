public class Main {

    protected PreDeConModel computeLocalModel(DoubleDBIDList neighbors, ....){
        final int referenceSetSize = nighbors.size();
        ....
        /// Shouldn't happen:
        if (referenceSetSize == 0){
            LOG.Warning("Empty reference set - should have at least include the query point!");
            return new PreDeConModel(Integer.MAX_VALUE, DBIDUtil.EMPTYDBIDS);
        }
        ....
        for(int d = 0; d < dim; d++){
            s[d] /= referenceSetSize;
            mvVar.put(s[d]);
        }
        ....
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}