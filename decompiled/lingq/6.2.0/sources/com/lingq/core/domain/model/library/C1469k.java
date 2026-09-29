package com.lingq.core.domain.model.library;

import com.lingq.core.domain.model.LearningLevel;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;

/* JADX INFO: renamed from: com.lingq.core.domain.model.library.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1469k {
    /* JADX INFO: renamed from: a */
    public static LinkedHashMap m8095a(int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (LearningLevel learningLevel : LearningLevel.values()) {
            int iOrdinal = learningLevel.ordinal();
            linkedHashMap.put(learningLevel, Boolean.valueOf(i <= iOrdinal && iOrdinal <= i2));
        }
        return linkedHashMap;
    }

    public final KSerializer serializer() {
        return LibrarySearchQuery$$serializer.INSTANCE;
    }
}
