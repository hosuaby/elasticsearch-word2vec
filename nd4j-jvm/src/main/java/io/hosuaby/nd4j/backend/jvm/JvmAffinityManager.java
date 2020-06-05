package io.hosuaby.nd4j.backend.jvm;

import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.concurrency.BasicAffinityManager;
import org.nd4j.linalg.api.ndarray.INDArray;

public final class JvmAffinityManager extends BasicAffinityManager {
    @Override
    public void touch(INDArray array) {
        // NO-OP
    }

    @Override
    public void touch(DataBuffer buffer) {
        // NO-OP
    }
}