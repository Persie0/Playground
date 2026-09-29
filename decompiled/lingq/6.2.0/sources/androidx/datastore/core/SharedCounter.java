package androidx.datastore.core;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C3386nv;
import p000.ui3;
import p000.v63;

/* JADX INFO: loaded from: classes.dex */
public interface SharedCounter {
    public static final Factory Factory = Factory.$$INSTANCE;

    public static final class Factory {
        static final /* synthetic */ Factory $$INSTANCE = new Factory();
        private static final NativeSharedCounter nativeSharedCounter;

        static {
            System.loadLibrary("datastore_shared_counter");
            nativeSharedCounter = new NativeSharedCounter();
        }

        private Factory() {
        }

        private final SharedCounter createCounterFromFd(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            NativeSharedCounter nativeSharedCounter2 = nativeSharedCounter;
            if (nativeSharedCounter2 == null) {
                C3386nv.m17633t("DataStore failed to load the native library to create SharedCounter.");
                return null;
            }
            int fd = parcelFileDescriptor.getFd();
            if (nativeSharedCounter2.nativeTruncateFile(fd) != 0) {
                v63.m23133k("Failed to truncate counter file");
                return null;
            }
            long jNativeCreateSharedCounter = nativeSharedCounter2.nativeCreateSharedCounter(fd);
            if (jNativeCreateSharedCounter >= 0) {
                return new RealSharedCounter(nativeSharedCounter2, jNativeCreateSharedCounter);
            }
            v63.m23133k("Failed to mmap counter file");
            return null;
        }

        private final boolean isDalvik() {
            return "dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        }

        public final SharedCounter create$datastore_core(ui3 ui3Var) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            ui3Var.getClass();
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) ui3Var.mo0a(), 939524096);
                try {
                    parcelFileDescriptorOpen.getClass();
                    SharedCounter sharedCounterCreateCounterFromFd = createCounterFromFd(parcelFileDescriptorOpen);
                    parcelFileDescriptorOpen.close();
                    return sharedCounterCreateCounterFromFd;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }
    }

    public static final class RealSharedCounter implements SharedCounter {
        private final long mappedAddress;
        private final NativeSharedCounter nativeSharedCounter;

        public RealSharedCounter(NativeSharedCounter nativeSharedCounter, long j) {
            nativeSharedCounter.getClass();
            this.nativeSharedCounter = nativeSharedCounter;
            this.mappedAddress = j;
        }

        @Override // androidx.datastore.core.SharedCounter
        public int getValue() {
            return this.nativeSharedCounter.nativeGetCounterValue(this.mappedAddress);
        }

        @Override // androidx.datastore.core.SharedCounter
        public int incrementAndGetValue() {
            return this.nativeSharedCounter.nativeIncrementAndGetCounterValue(this.mappedAddress);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ShadowSharedCounter implements SharedCounter {
        private final AtomicInteger value = new AtomicInteger(0);

        @Override // androidx.datastore.core.SharedCounter
        public int getValue() {
            return this.value.get();
        }

        @Override // androidx.datastore.core.SharedCounter
        public int incrementAndGetValue() {
            return this.value.incrementAndGet();
        }
    }

    int getValue();

    int incrementAndGetValue();
}
