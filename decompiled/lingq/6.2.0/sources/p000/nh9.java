package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nh9 implements Map.Entry, wg4 {

    /* JADX INFO: renamed from: a */
    public final Object f52739a;

    /* JADX INFO: renamed from: b */
    public Object f52740b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oh9 f52741c;

    public nh9(oh9 oh9Var) {
        this.f52741c = oh9Var;
        Map.Entry entry = oh9Var.f54358d;
        entry.getClass();
        this.f52739a = entry.getKey();
        Map.Entry entry2 = oh9Var.f54358d;
        entry2.getClass();
        this.f52740b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f52739a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f52740b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        oh9 oh9Var = this.f52741c;
        cd9 cd9Var = oh9Var.f54355a;
        if (cd9Var.m4547b().f8393d != oh9Var.f54357c) {
            C3386nv.m17619e();
            return null;
        }
        Object obj2 = this.f52740b;
        cd9Var.put(this.f52739a, obj);
        this.f52740b = obj;
        return obj2;
    }
}
