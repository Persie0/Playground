package com.google.protobuf;

import p000.g9a;
import p000.go7;
import p000.m58;
import p000.tx2;
import p000.uk3;
import p000.xm8;
import p000.zfa;

/* JADX INFO: renamed from: com.google.protobuf.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1187h implements xm8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1180a f13950a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1189j f13951b;

    /* JADX INFO: renamed from: c */
    public final tx2 f13952c;

    public C1187h(AbstractC1189j abstractC1189j, tx2 tx2Var, AbstractC1180a abstractC1180a) {
        this.f13951b = abstractC1189j;
        tx2Var.getClass();
        this.f13952c = tx2Var;
        this.f13950a = abstractC1180a;
    }

    /* JADX INFO: renamed from: e */
    public static C1187h m6846e(AbstractC1189j abstractC1189j, tx2 tx2Var, AbstractC1180a abstractC1180a) {
        return new C1187h(abstractC1189j, tx2Var, abstractC1180a);
    }

    @Override // p000.xm8
    /* JADX INFO: renamed from: a */
    public final int mo6831a(AbstractC1183d abstractC1183d) {
        ((zfa) this.f13951b).getClass();
        return abstractC1183d.unknownFields.hashCode();
    }

    @Override // p000.xm8
    /* JADX INFO: renamed from: b */
    public final int mo6832b(AbstractC1183d abstractC1183d) {
        ((zfa) this.f13951b).getClass();
        C1190k c1190k = abstractC1183d.unknownFields;
        int i = c1190k.f13960d;
        if (i != -1) {
            return i;
        }
        int iM6795d = 0;
        for (int i2 = 0; i2 < c1190k.f13957a; i2++) {
            int i3 = c1190k.f13958b[i2] >>> 3;
            ByteString byteString = (ByteString) c1190k.f13959c[i2];
            int iM6795d2 = C1181b.m6795d(i3) + C1181b.m6794c(2) + (C1181b.m6794c(1) * 2);
            int iM6794c = C1181b.m6794c(3);
            int size = byteString.size();
            iM6795d += C1181b.m6795d(size) + size + iM6794c + iM6795d2;
        }
        c1190k.f13960d = iM6795d;
        return iM6795d;
    }

    @Override // p000.xm8
    /* JADX INFO: renamed from: c */
    public final boolean mo6833c(AbstractC1183d abstractC1183d, AbstractC1183d abstractC1183d2) {
        zfa zfaVar = (zfa) this.f13951b;
        zfaVar.getClass();
        C1190k c1190k = abstractC1183d.unknownFields;
        zfaVar.getClass();
        return c1190k.equals(abstractC1183d2.unknownFields);
    }

    @Override // p000.xm8
    /* JADX INFO: renamed from: d */
    public final void mo6834d(Object obj, m58 m58Var) {
        this.f13952c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.xm8
    public final boolean isInitialized(Object obj) {
        this.f13952c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.xm8
    public final void makeImmutable(Object obj) {
        ((zfa) this.f13951b).getClass();
        C1190k c1190k = ((AbstractC1183d) obj).unknownFields;
        if (c1190k.f13961e) {
            c1190k.f13961e = false;
        }
        this.f13952c.getClass();
        g9a.m12435l(obj);
        throw null;
    }

    @Override // p000.xm8
    public final void mergeFrom(Object obj, Object obj2) {
        AbstractC1188i.m6859j(this.f13951b, obj, obj2);
    }

    @Override // p000.xm8
    public final AbstractC1183d newInstance() {
        AbstractC1180a abstractC1180a = this.f13950a;
        if (abstractC1180a instanceof AbstractC1183d) {
            return (AbstractC1183d) ((AbstractC1183d) abstractC1180a).mo454k(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }
        AbstractC1183d abstractC1183d = (AbstractC1183d) abstractC1180a;
        abstractC1183d.getClass();
        uk3 uk3Var = (uk3) abstractC1183d.mo454k(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
        boolean zM6815n = uk3Var.f64019b.m6815n();
        AbstractC1183d abstractC1183d2 = uk3Var.f64019b;
        if (!zM6815n) {
            return abstractC1183d2;
        }
        abstractC1183d2.getClass();
        go7 go7Var = go7.f41083c;
        go7Var.getClass();
        go7Var.m12783a(abstractC1183d2.getClass()).makeImmutable(abstractC1183d2);
        abstractC1183d2.m6816o();
        return uk3Var.f64019b;
    }
}
