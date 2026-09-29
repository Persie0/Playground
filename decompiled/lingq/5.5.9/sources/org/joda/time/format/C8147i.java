package org.joda.time.format;

/* JADX INFO: renamed from: org.joda.time.format.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C8147i implements InterfaceC8141c, InterfaceC8146h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8146h f44243a;

    public C8147i(InterfaceC8146h interfaceC8146h) {
        this.f44243a = interfaceC8146h;
    }

    @Override // org.joda.time.format.InterfaceC8141c
    /* JADX INFO: renamed from: a */
    public final int mo16118a(C8142d c8142d, String str, int i10) {
        return this.f44243a.parseInto(c8142d, str, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8147i) {
            return this.f44243a.equals(((C8147i) obj).f44243a);
        }
        return false;
    }

    @Override // org.joda.time.format.InterfaceC8141c, org.joda.time.format.InterfaceC8146h
    public final int estimateParsedLength() {
        return this.f44243a.estimateParsedLength();
    }

    public final int hashCode() {
        return this.f44243a.hashCode();
    }

    @Override // org.joda.time.format.InterfaceC8146h
    public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
        return this.f44243a.parseInto(c8142d, charSequence, i10);
    }
}
