package coil.util;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements ui3 {

    /* JADX INFO: renamed from: i */
    public static final Time$provider$1 f10576i = new Time$provider$1(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
