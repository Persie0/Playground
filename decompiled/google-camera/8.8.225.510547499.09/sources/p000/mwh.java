package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mwh extends mwx implements Map, mtz {
    /* JADX INFO: renamed from: b */
    public static mwh m17062b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        lku.m15653g(obj, obj2);
        lku.m15653g(obj3, obj4);
        lku.m15653g(obj5, obj6);
        return new mzq(new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    /* JADX INFO: renamed from: c */
    public static mwh m17063c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        lku.m15653g(obj, obj2);
        lku.m15653g(obj3, obj4);
        lku.m15653g(obj5, obj6);
        lku.m15653g(obj7, obj8);
        return new mzq(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, 4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: a */
    public abstract mwh mo17064a();

    @Override // p000.mwx
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ mwj mo17065d() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ mtz mo16877e() {
        throw null;
    }

    @Override // p000.mtz
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Set values() {
        throw null;
    }

    @Override // p000.mwx, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final mxk values() {
        return mo17064a().keySet();
    }

    @Override // p000.mtz
    @Deprecated
    /* JADX INFO: renamed from: k */
    public final void mo16883k(Object obj, Object obj2) {
        throw null;
    }

    @Override // p000.mwx
    Object writeReplace() {
        return new mwg(this);
    }
}
