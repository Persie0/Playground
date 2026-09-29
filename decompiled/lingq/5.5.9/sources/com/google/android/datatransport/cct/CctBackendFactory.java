package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import p410u8.C9477b;
import p477x8.AbstractC10119f;
import p477x8.InterfaceC10116c;
import p477x8.InterfaceC10124k;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class CctBackendFactory implements InterfaceC10116c {
    @Override // p477x8.InterfaceC10116c
    public InterfaceC10124k create(AbstractC10119f abstractC10119f) {
        return new C9477b(abstractC10119f.mo18975a(), abstractC10119f.mo18978d(), abstractC10119f.mo18977c());
    }
}
