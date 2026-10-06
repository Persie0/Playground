package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyj {

    /* JADX INFO: renamed from: d */
    private static final SimpleDateFormat f26831d;

    /* JADX INFO: renamed from: a */
    public final kqc f26832a;

    /* JADX INFO: renamed from: b */
    public final boolean f26833b;

    /* JADX INFO: renamed from: c */
    public dzk f26834c;

    /* JADX INFO: renamed from: e */
    private final gyn f26835e;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        f26831d = simpleDateFormat;
    }

    public gyj(gyn gynVar, kqc kqcVar, dzk dzkVar, boolean z) {
        this.f26835e = gynVar;
        this.f26832a = kqcVar;
        this.f26833b = z;
        this.f26834c = dzkVar;
        if (z) {
            gynVar.m9983c().mo14694e(kqcVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9976a() {
        this.f26835e.m9986f(this, gym.ABANDON);
    }

    /* JADX INFO: renamed from: b */
    public final void m9977b() {
        this.f26835e.m9986f(this, gym.PUBLISH);
    }

    public final String toString() {
        String strConcat = mro.m16832b(this.f26835e.f26855d) ? "" : "-".concat(String.valueOf(this.f26835e.f26855d));
        return "PXL_" + f26831d.format(new Date(this.f26835e.f26852a)) + strConcat + " (" + this.f26832a.toString() + " isprimary=" + this.f26833b + ")";
    }
}
