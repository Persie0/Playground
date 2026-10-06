package p000;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adu implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f173a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f174b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ adt f175c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f176d;

    public adu(String str, Context context, adt adtVar, int i) {
        this.f173a = str;
        this.f174b = context;
        this.f175c = adtVar;
        this.f176d = i;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kym call() {
        try {
            return adw.m311b(this.f173a, this.f174b, this.f175c, this.f176d);
        } catch (Throwable th) {
            return new kym(-3, (byte[]) null);
        }
    }
}
