package kotlin.jvm.internal;

import dm.C5207g;
import dm.C5209i;
import dm.InterfaceC5205e;
import km.InterfaceC6718a;
import km.InterfaceC6722e;

/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements InterfaceC5205e, InterfaceC6722e {

    /* JADX INFO: renamed from: h */
    public final int f38118h;

    /* JADX INFO: renamed from: i */
    public final int f38119i;

    public FunctionReference(int i10) {
        this(i10, CallableReference.f38110g, null, null, null, 0);
    }

    public FunctionReference(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public FunctionReference(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f38118h = i10;
        this.f38119i = i11 >> 1;
    }

    @Override // dm.InterfaceC5205e
    /* JADX INFO: renamed from: J */
    public final int mo10978J() {
        return this.f38118h;
    }

    @Override // kotlin.jvm.internal.CallableReference
    /* JADX INFO: renamed from: c */
    public final InterfaceC6718a mo13478c() {
        return C5209i.f33277a.mo11121a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return mo13336a().equals(functionReference.mo13336a()) && mo13480e().equals(functionReference.mo13480e()) && this.f38119i == functionReference.f38119i && this.f38118h == functionReference.f38118h && C5207g.m11106a(this.f38112b, functionReference.f38112b) && C5207g.m11106a(mo13479d(), functionReference.mo13479d());
        }
        if (!(obj instanceof InterfaceC6722e)) {
            return false;
        }
        InterfaceC6718a interfaceC6718aMo13478c = this.f38111a;
        if (interfaceC6718aMo13478c == null) {
            interfaceC6718aMo13478c = mo13478c();
            this.f38111a = interfaceC6718aMo13478c;
        }
        return obj.equals(interfaceC6718aMo13478c);
    }

    public final int hashCode() {
        return mo13480e().hashCode() + ((mo13336a().hashCode() + (mo13479d() == null ? 0 : mo13479d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC6718a interfaceC6718aMo13478c = this.f38111a;
        if (interfaceC6718aMo13478c == null) {
            interfaceC6718aMo13478c = mo13478c();
            this.f38111a = interfaceC6718aMo13478c;
        }
        if (interfaceC6718aMo13478c != this) {
            return interfaceC6718aMo13478c.toString();
        }
        if ("<init>".equals(mo13336a())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo13336a() + " (Kotlin reflection is not available)";
    }
}
