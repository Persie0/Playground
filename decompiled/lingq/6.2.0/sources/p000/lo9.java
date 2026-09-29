package p000;

import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lo9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final Object f49945b;

    /* JADX INFO: renamed from: c */
    public final Object f49946c;

    /* JADX INFO: renamed from: d */
    public final Object[] f49947d;

    /* JADX INFO: renamed from: e */
    public final PointerInputEventHandler f49948e;

    public lo9(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.f49945b = obj;
        this.f49946c = obj2;
        this.f49947d = objArr;
        this.f49948e = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo9)) {
            return false;
        }
        lo9 lo9Var = (lo9) obj;
        if (!fa4.m11650l(this.f49945b, lo9Var.f49945b) || !fa4.m11650l(this.f49946c, lo9Var.f49946c)) {
            return false;
        }
        Object[] objArr = lo9Var.f49947d;
        Object[] objArr2 = this.f49947d;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.f49948e == lo9Var.f49948e;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0333g(this.f49945b, this.f49946c, this.f49947d, this.f49948e);
    }

    public final int hashCode() {
        Object obj = this.f49945b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f49946c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f49947d;
        return this.f49948e.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "pointerInput";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f49945b, "key1");
        z91Var.m25511b(this.f49946c, "key2");
        z91Var.m25511b(this.f49947d, "keys");
        z91Var.m25511b(this.f49948e, "pointerInputEventHandler");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        C0333g c0333g = (C0333g) d16Var;
        Object obj = c0333g.f4137J;
        Object obj2 = this.f49945b;
        boolean z = !fa4.m11650l(obj, obj2);
        c0333g.f4137J = obj2;
        Object obj3 = c0333g.f4138K;
        Object obj4 = this.f49946c;
        if (!fa4.m11650l(obj3, obj4)) {
            z = true;
        }
        c0333g.f4138K = obj4;
        Object[] objArr = c0333g.f4139L;
        Object[] objArr2 = this.f49947d;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        c0333g.f4139L = objArr2;
        Class<?> cls = c0333g.f4140M.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f49948e;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            c0333g.m1481b1();
        }
        c0333g.f4140M = pointerInputEventHandler;
    }
}
