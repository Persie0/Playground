package p000;

import android.content.Context;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnr {

    /* JADX INFO: renamed from: a */
    public static final nbh f6369a = nbh.m17259h("com/google/android/apps/camera/brella/examplestore/lib/CamSqliteExampleStore");

    /* JADX INFO: renamed from: b */
    public final cns f6370b;

    /* JADX INFO: renamed from: c */
    public final ksi f6371c;

    /* JADX INFO: renamed from: d */
    public final Random f6372d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f6373e;

    /* JADX INFO: renamed from: f */
    public final Map f6374f;

    /* JADX INFO: renamed from: g */
    public final mws f6375g;

    /* JADX INFO: renamed from: h */
    public final mws f6376h;

    public cnr(Context context, ksi ksiVar, Random random, ExecutorService executorService, mws mwsVar, mws mwsVar2, Set set, mwx mwxVar) {
        this.f6370b = new cns(context, mws.m17095j(set));
        this.f6371c = ksiVar;
        this.f6372d = random;
        this.f6373e = executorService;
        this.f6374f = mwxVar;
        this.f6375g = mwsVar;
        this.f6376h = mwsVar2;
    }

    /* JADX INFO: renamed from: a */
    public final nps m3993a(mrf mrfVar) {
        return kxk.m14970P(new cnn(this, mrfVar, 1), this.f6373e);
    }
}
