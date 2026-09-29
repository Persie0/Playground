package p000;

import kotlinx.coroutines.flow.C3229i;

/* JADX INFO: loaded from: classes.dex */
public final class vm9 extends C3229i implements eh9 {
    @Override // p000.eh9
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f48063h;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f48064i + ((long) ((int) ((m15556n() + ((long) this.f48066k)) - this.f48064i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: v */
    public final void m23426v(int i) {
        synchronized (this) {
            Object[] objArr = this.f48063h;
            objArr.getClass();
            m15558p(Integer.valueOf(((Number) objArr[((int) ((this.f48064i + ((long) ((int) ((m15556n() + ((long) this.f48066k)) - this.f48064i)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
