package com.google.common.collect;

/* JADX INFO: renamed from: com.google.common.collect.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3206y extends MultimapBuilder.AbstractC3173a<Object, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16179a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MultimapBuilder.AbstractC3174b f16180b;

    public C3206y(MultimapBuilder.AbstractC3174b abstractC3174b) {
        this.f16180b = abstractC3174b;
    }

    /* JADX INFO: renamed from: b */
    public final <K, V> InterfaceC3196o<K, V> m9139b() {
        return new Multimaps$CustomListMultimap(this.f16180b.mo9118a(), new MultimapBuilder.ArrayListSupplier(this.f16179a));
    }
}
