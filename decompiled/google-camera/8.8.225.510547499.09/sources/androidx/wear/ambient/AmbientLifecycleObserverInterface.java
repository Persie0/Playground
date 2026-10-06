package androidx.wear.ambient;

import p000.akl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface AmbientLifecycleObserverInterface extends akl {

    /* JADX INFO: compiled from: PG */
    public final class AmbientDetails {

        /* JADX INFO: renamed from: a */
        private final boolean f1691a;

        /* JADX INFO: renamed from: b */
        private final boolean f1692b;

        public AmbientDetails(boolean z, boolean z2) {
            this.f1691a = z;
            this.f1692b = z2;
        }

        public final boolean getBurnInProtectionRequired() {
            return this.f1691a;
        }

        public final boolean getDeviceHasLowBitAmbient() {
            return this.f1692b;
        }

        public final String toString() {
            return "AmbientDetails - burnInProtectionRequired: " + this.f1691a + ", deviceHasLowBitAmbient: " + this.f1692b;
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface AmbientLifecycleCallback {

        /* JADX INFO: renamed from: androidx.wear.ambient.AmbientLifecycleObserverInterface$AmbientLifecycleCallback$-CC, reason: invalid class name */
        /* JADX INFO: compiled from: PG */
        public /* synthetic */ class CC {
            public static void $default$onExitAmbient(AmbientLifecycleCallback ambientLifecycleCallback) {
            }

            public static void $default$onUpdateAmbient(AmbientLifecycleCallback ambientLifecycleCallback) {
            }

            /* JADX INFO: renamed from: a */
            public void mo1625a(int i) {
            }

            /* JADX INFO: renamed from: b */
            public void mo1626b(int i, float f, int i2) {
            }

            /* JADX INFO: renamed from: c */
            public void mo1627c(int i) {
                throw null;
            }
        }

        void onEnterAmbient(AmbientDetails ambientDetails);

        void onExitAmbient();

        void onUpdateAmbient();
    }

    boolean isAmbient();
}
