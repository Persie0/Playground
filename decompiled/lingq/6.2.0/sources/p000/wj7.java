package p000;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class wj7 extends i81 {

    /* JADX INFO: renamed from: b */
    public final vj7 f66933b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj7(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.f66933b = new vj7(kSerializer.getDescriptor());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: a */
    public final Object mo11356a() {
        return (uj7) mo11358g(mo12406j());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: b */
    public final int mo11357b(Object obj) {
        uj7 uj7Var = (uj7) obj;
        uj7Var.getClass();
        return uj7Var.mo4384d();
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: c */
    public final Iterator mo14415c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.AbstractC3815z, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return m25393e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f66933b;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: h */
    public final Object mo11359h(Object obj) {
        uj7 uj7Var = (uj7) obj;
        uj7Var.getClass();
        return uj7Var.mo4382a();
    }

    @Override // p000.i81
    /* JADX INFO: renamed from: i */
    public final void mo11360i(int i, Object obj, Object obj2) {
        ((uj7) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo12406j();

    /* JADX INFO: renamed from: k */
    public abstract void mo12407k(mk9 mk9Var, Object obj, int i);

    @Override // p000.i81, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int iMo12404d = mo12404d(obj);
        vj7 vj7Var = this.f66933b;
        mk9 mk9VarM15618n = encoder.m15618n(vj7Var);
        mo12407k(mk9VarM15618n, obj, iMo12404d);
        mk9VarM15618n.m16871A(vj7Var);
    }
}
