package com.google.common.util.concurrent;

import androidx.fragment.app.C0987y;
import com.google.common.collect.C3197p;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class CycleDetectingLockFactory {

    public static class ExampleStackTrace extends IllegalStateException {
        static {
            ImmutableSet.m9082a0(CycleDetectingLockFactory.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace", C3209b.class.getName());
        }
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        @Override // java.lang.Throwable
        public final String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            return new StringBuilder(message).toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$a */
    public class C3208a extends ThreadLocal<ArrayList<C3209b>> {
        @Override // java.lang.ThreadLocal
        public final ArrayList<C3209b> initialValue() {
            C0987y.m3820b("initialArraySize", 3);
            return new ArrayList<>(3);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.CycleDetectingLockFactory$b */
    public static class C3209b {
    }

    static {
        C3197p c3197p = new C3197p();
        c3197p.m9138c();
        c3197p.m9137b();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new C3208a();
    }
}
