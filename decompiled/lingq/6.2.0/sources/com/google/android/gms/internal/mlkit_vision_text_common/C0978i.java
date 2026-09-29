package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;
import p000.AbstractC2911d1;
import p000.ts3;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_text_common.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0978i extends AbstractC2911d1 {

    /* JADX INFO: renamed from: b */
    public final Object f12044b;

    /* JADX INFO: renamed from: c */
    public int f12045c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzba f12046d;

    public C0978i(zzba zzbaVar, int i) {
        super(1, false);
        this.f12046d = zzbaVar;
        Object obj = zzba.f12071j;
        this.f12044b = zzbaVar.m5483b()[i];
        this.f12045c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m5475a() {
        int i = this.f12045c;
        Object obj = this.f12044b;
        zzba zzbaVar = this.f12046d;
        if (i != -1 && i < zzbaVar.size()) {
            if (ts3.m22281b(obj, zzbaVar.m5483b()[this.f12045c])) {
                return;
            }
        }
        Object obj2 = zzba.f12071j;
        this.f12045c = zzbaVar.m5489h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12044b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzba zzbaVar = this.f12046d;
        Map mapM5485d = zzbaVar.m5485d();
        if (mapM5485d != null) {
            return mapM5485d.get(this.f12044b);
        }
        m5475a();
        int i = this.f12045c;
        if (i == -1) {
            return null;
        }
        return zzbaVar.m5484c()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzba zzbaVar = this.f12046d;
        Map mapM5485d = zzbaVar.m5485d();
        Object obj2 = this.f12044b;
        if (mapM5485d != null) {
            return mapM5485d.put(obj2, obj);
        }
        m5475a();
        int i = this.f12045c;
        if (i == -1) {
            zzbaVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzbaVar.m5484c()[i];
        zzbaVar.m5484c()[this.f12045c] = obj;
        return obj3;
    }
}
