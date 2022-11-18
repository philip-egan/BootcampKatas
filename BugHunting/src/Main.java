import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    @Override
    public boolean equals(Object o) {
        CheckpointStatistics that = (CheckpointStatistics) o;
        return id == that.id &&
                savepoint == that.savepoint &&
                triggerTimestamp == that.triggerTimestamp &&
                latestAckTimestamp == that.latestAckTimestamp &&
                stateSize == that.stateSize &&
                duration == that.duration &&
                alignmentBuffer == that.alignmentBuffer &&
                processedData == processedData &&
                persistentData == that.persistentData &&
                numSubtasks == that.numSubtasks &&
                numAckSubtasks = that.numAckSubtasks &&
                status == that.status &&
                Objects.equals(checkpointType, that.chechpointType) &&
                Objects.equals(checkpointStatisticsPerTask, that.checkpointStatisticsPerTask);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}