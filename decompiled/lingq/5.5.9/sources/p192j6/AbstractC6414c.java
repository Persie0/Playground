package p192j6;

import android.graphics.drawable.Drawable;
import p171i6.InterfaceC6199d;
import p258m6.C7492l;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6414c<T> implements InterfaceC6419h<T> {

    /* JADX INFO: renamed from: a */
    public final int f36879a;

    /* JADX INFO: renamed from: b */
    public final int f36880b;

    /* JADX INFO: renamed from: c */
    public InterfaceC6199d f36881c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC6414c() {
        if (!C7492l.m14888i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f36879a = Integer.MIN_VALUE;
        this.f36880b = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: g */
    public final void mo12735g(InterfaceC6199d interfaceC6199d) {
        this.f36881c = interfaceC6199d;
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: i */
    public final void mo12736i(InterfaceC6418g interfaceC6418g) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: j */
    public final void mo6263j(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: k */
    public final void mo12737k(Drawable drawable) {
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: m */
    public final void mo12738m(InterfaceC6418g interfaceC6418g) {
        interfaceC6418g.mo6388b(this.f36879a, this.f36880b);
    }

    @Override // p192j6.InterfaceC6419h
    /* JADX INFO: renamed from: p */
    public final InterfaceC6199d mo12740p() {
        return this.f36881c;
    }
}
