package org.joda.time.format;

/* JADX INFO: renamed from: org.joda.time.format.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C8143e implements InterfaceC8146h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8141c f44181a;

    public C8143e(InterfaceC8141c interfaceC8141c) {
        this.f44181a = interfaceC8141c;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC8146h m16126a(InterfaceC8141c interfaceC8141c) {
        if (interfaceC8141c instanceof C8147i) {
            return (InterfaceC8146h) interfaceC8141c;
        }
        if (interfaceC8141c == null) {
            return null;
        }
        return new C8143e(interfaceC8141c);
    }

    @Override // org.joda.time.format.InterfaceC8146h
    public final int estimateParsedLength() {
        return this.f44181a.estimateParsedLength();
    }

    @Override // org.joda.time.format.InterfaceC8146h
    public final int parseInto(C8142d c8142d, CharSequence charSequence, int i10) {
        return this.f44181a.mo16118a(c8142d, charSequence.toString(), i10);
    }
}
