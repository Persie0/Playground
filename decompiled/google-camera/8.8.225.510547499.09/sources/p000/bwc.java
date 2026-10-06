package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwc implements bvl {

    /* JADX INFO: renamed from: a */
    private final Context f4638a;

    /* JADX INFO: renamed from: b */
    private final bvl f4639b;

    /* JADX INFO: renamed from: c */
    private final bvl f4640c;

    /* JADX INFO: renamed from: d */
    private final Class f4641d;

    public bwc(Context context, bvl bvlVar, bvl bvlVar2, Class cls) {
        this.f4638a = context.getApplicationContext();
        this.f4639b = bvlVar;
        this.f4640c = bvlVar2;
        this.f4641d = cls;
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3083a(Object obj) {
        return bzq.m3282v((Uri) obj);
    }

    @Override // p000.bvl
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ C1058va mo3084b(Object obj, int i, int i2, bqr bqrVar) {
        Uri uri = (Uri) obj;
        return new C1058va(new cat(uri), new bwb(this.f4638a, this.f4639b, this.f4640c, uri, i, i2, bqrVar, this.f4641d));
    }
}
