package p004a3;

import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: a3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0015e {

    /* JADX INFO: renamed from: a */
    public final b f8a;

    /* JADX INFO: renamed from: a3.e$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final InputContentInfo f9a;

        public a(Object obj) {
            this.f9a = (InputContentInfo) obj;
        }

        /* JADX INFO: renamed from: a */
        public final Object m53a() {
            return this.f9a;
        }

        /* JADX INFO: renamed from: b */
        public final void m54b() {
            this.f9a.requestPermission();
        }
    }

    /* JADX INFO: renamed from: a3.e$b */
    public interface b {
    }

    public C0015e(a aVar) {
        this.f8a = aVar;
    }
}
