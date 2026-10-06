package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzn {

    /* JADX INFO: renamed from: a */
    public static final String[] f12994a = {"special_type_id"};

    /* JADX INFO: renamed from: b */
    public final nqf f12995b = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public final nqf f12996c = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    public final Executor f12997d;

    public dzn(dzp dzpVar, Executor executor) {
        this.f12997d = executor;
        executor.execute(new dgq(this, dzpVar, 13));
    }
}
