package metrics.decision

import metrics.DecisionMetric
import model.PathCache
import metrics.assistive.MeanOfPathLengths

class NormalisedMOPL(private val cache: PathCache) : DecisionMetric() {
    override fun calculate(): Double = MeanOfPathLengths(cache).calculate() / NumberOfPaths(cache).calculate()
}