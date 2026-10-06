package p000;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jdv extends Exception {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public final Status f33813a;

    /* JADX WARN: Illegal instructions before constructor call */
    public jdv(Status status) {
        int i = status.f7607g;
        String str = status.f7608h;
        super(i + ": " + (str == null ? "" : str));
        this.f33813a = status;
    }

    /* JADX INFO: renamed from: a */
    public final int m12951a() {
        return this.f33813a.f7607g;
    }
}
