package com.lingq.core.database;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.C0736a;
import com.lingq.core.database.LingQDatabase_Impl;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.dao.AbstractC1323k;
import com.lingq.core.database.dao.C1313a;
import com.lingq.core.database.dao.C1314b;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.dao.C1316d;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.dao.C1322j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.dn6;
import p000.hx4;
import p000.io1;
import p000.lm6;
import p000.lq2;
import p000.md5;
import p000.nd5;
import p000.np8;
import p000.o7b;
import p000.od5;
import p000.pd5;
import p000.q05;
import p000.rd5;
import p000.rxa;
import p000.sy5;
import p000.u38;
import p000.uf4;
import p000.ui3;
import p000.ul4;
import p000.un0;
import p000.uy5;
import p000.v3a;
import p000.wi5;
import p000.x27;
import p000.xp6;
import p000.y38;
import p000.yp0;
import p000.z21;
import p000.zca;

/* JADX INFO: loaded from: classes.dex */
public final class LingQDatabase_Impl extends LingQDatabase {

    /* JADX INFO: renamed from: A */
    public final cs4 f16817A = AbstractC3192a.m15356a(new uf4(this));

    /* JADX INFO: renamed from: B */
    public final cs4 f16818B;

    /* JADX INFO: renamed from: C */
    public final cs4 f16819C;

    /* JADX INFO: renamed from: D */
    public final cs4 f16820D;

    /* JADX INFO: renamed from: E */
    public final cs4 f16821E;

    /* JADX INFO: renamed from: F */
    public final cs4 f16822F;

    /* JADX INFO: renamed from: G */
    public final cs4 f16823G;

    /* JADX INFO: renamed from: H */
    public final cs4 f16824H;

    /* JADX INFO: renamed from: I */
    public final cs4 f16825I;

    /* JADX INFO: renamed from: J */
    public final cs4 f16826J;

    /* JADX INFO: renamed from: K */
    public final cs4 f16827K;

    /* JADX INFO: renamed from: L */
    public final cs4 f16828L;

    /* JADX INFO: renamed from: l */
    public final cs4 f16829l;

    /* JADX INFO: renamed from: m */
    public final cs4 f16830m;

    /* JADX INFO: renamed from: n */
    public final cs4 f16831n;

    /* JADX INFO: renamed from: o */
    public final cs4 f16832o;

    /* JADX INFO: renamed from: p */
    public final cs4 f16833p;

    /* JADX INFO: renamed from: q */
    public final cs4 f16834q;

    /* JADX INFO: renamed from: r */
    public final cs4 f16835r;

    /* JADX INFO: renamed from: s */
    public final cs4 f16836s;

    /* JADX INFO: renamed from: t */
    public final cs4 f16837t;

    /* JADX INFO: renamed from: u */
    public final cs4 f16838u;

    /* JADX INFO: renamed from: v */
    public final cs4 f16839v;

    /* JADX INFO: renamed from: w */
    public final cs4 f16840w;

    /* JADX INFO: renamed from: x */
    public final cs4 f16841x;

    /* JADX INFO: renamed from: y */
    public final cs4 f16842y;

    /* JADX INFO: renamed from: z */
    public final cs4 f16843z;

    public LingQDatabase_Impl() {
        final int i = 0;
        this.f16829l = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i2 = i;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i2) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i2 = 2;
        this.f16830m = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i3) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i3 = 10;
        this.f16831n = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i4) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i4 = 12;
        this.f16832o = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i5 = i4;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i5) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i5 = 13;
        this.f16833p = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i6 = i5;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i6) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i6 = 14;
        this.f16834q = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i7 = i6;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i7) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i7 = 15;
        this.f16835r = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i8 = i7;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i8) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i8 = 16;
        this.f16836s = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i9 = i8;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i9) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i9 = 17;
        this.f16837t = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i10 = i9;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i10) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i10 = 18;
        this.f16838u = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i11 = i10;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i11) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i11 = 11;
        this.f16839v = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i12 = i11;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i12) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i12 = 19;
        this.f16840w = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i13 = i12;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i13) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i13 = 20;
        this.f16841x = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i14 = i13;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i14) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i14 = 21;
        this.f16842y = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i15 = i14;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i15) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i15 = 22;
        this.f16843z = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i16 = i15;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i16) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i16 = 23;
        this.f16818B = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i17 = i16;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i17) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i17 = 24;
        this.f16819C = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i18 = i17;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i18) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i18 = 25;
        this.f16820D = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i19 = i18;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i19) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i19 = 1;
        this.f16821E = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i19;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i20 = 3;
        this.f16822F = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i20;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i21 = 4;
        this.f16823G = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i21;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i22 = 5;
        this.f16824H = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i22;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i23 = 6;
        this.f16825I = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i23;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i24 = 7;
        this.f16826J = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i24;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i25 = 8;
        this.f16827K = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i25;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
        final int i26 = 9;
        this.f16828L = AbstractC3192a.m15356a(new ui3(this) { // from class: qd5

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LingQDatabase_Impl f57607b;

            {
                this.f57607b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i110 = i26;
                LingQDatabase_Impl lingQDatabase_Impl = this.f57607b;
                switch (i110) {
                    case 0:
                        return new C1321i(lingQDatabase_Impl);
                    case 1:
                        return new np8(lingQDatabase_Impl);
                    case 2:
                        return new q05(lingQDatabase_Impl);
                    case 3:
                        return new lm6(lingQDatabase_Impl);
                    case 4:
                        return new xp6(lingQDatabase_Impl);
                    case 5:
                        return new u38(lingQDatabase_Impl);
                    case 6:
                        return new C1314b(lingQDatabase_Impl);
                    case 7:
                        return new C1313a(lingQDatabase_Impl);
                    case 8:
                        return new C1315c(lingQDatabase_Impl);
                    case 9:
                        return new hx4(lingQDatabase_Impl);
                    case 10:
                        return new io1(lingQDatabase_Impl);
                    case 11:
                        return new C1322j(lingQDatabase_Impl);
                    case 12:
                        return new C1316d(lingQDatabase_Impl);
                    case 13:
                        return new C1317e(lingQDatabase_Impl);
                    case 14:
                        return new un0(lingQDatabase_Impl);
                    case 15:
                        return new o7b(lingQDatabase_Impl);
                    case 16:
                        return new v3a(lingQDatabase_Impl);
                    case 17:
                        return new ul4(lingQDatabase_Impl);
                    case 18:
                        return new C1319g(lingQDatabase_Impl);
                    case 19:
                        return new rxa(lingQDatabase_Impl);
                    case 20:
                        return new C1318f(lingQDatabase_Impl);
                    case 21:
                        return new wi5(lingQDatabase_Impl);
                    case 22:
                        return new zca(lingQDatabase_Impl);
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        return new yp0(lingQDatabase_Impl);
                    case 24:
                        return new dn6(lingQDatabase_Impl);
                    default:
                        return new uy5(lingQDatabase_Impl);
                }
            }
        });
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: A */
    public final io1 mo7432A() {
        return (io1) this.f16831n.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: B */
    public final C1317e mo7433B() {
        return (C1317e) this.f16833p.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: C */
    public final C1318f mo7434C() {
        return (C1318f) this.f16841x.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: D */
    public final ul4 mo7435D() {
        return (ul4) this.f16837t.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: E */
    public final C1319g mo7436E() {
        return (C1319g) this.f16838u.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: F */
    public final hx4 mo7437F() {
        return (hx4) this.f16828L.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: G */
    public final AbstractC1320h mo7438G() {
        return (AbstractC1320h) this.f16830m.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: H */
    public final C1321i mo7439H() {
        return (C1321i) this.f16829l.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: I */
    public final wi5 mo7440I() {
        return (wi5) this.f16842y.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: J */
    public final uy5 mo7441J() {
        return (uy5) this.f16820D.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: K */
    public final lm6 mo7442K() {
        return (lm6) this.f16822F.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: L */
    public final dn6 mo7443L() {
        return (dn6) this.f16819C.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: M */
    public final xp6 mo7444M() {
        return (xp6) this.f16823G.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: N */
    public final x27 mo7445N() {
        return (x27) this.f16817A.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: O */
    public final C1322j mo7446O() {
        return (C1322j) this.f16839v.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: P */
    public final u38 mo7447P() {
        return (u38) this.f16824H.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: Q */
    public final np8 mo7448Q() {
        return (np8) this.f16821E.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: R */
    public final v3a mo7449R() {
        return (v3a) this.f16836s.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: S */
    public final zca mo7450S() {
        return (zca) this.f16843z.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: T */
    public final AbstractC1323k mo7451T() {
        return (AbstractC1323k) this.f16840w.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: U */
    public final o7b mo7452U() {
        return (o7b) this.f16835r.getValue();
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: d */
    public final void mo2831d() {
        m2844q("LessonEntity", "LessonSentenceEntity", "CardEntity", "WordEntity", "LessonsAndCardsJoin", "LessonsAndWordsJoin", "DictionaryDataEntity", "DictionaryLocaleEntity", "ChallengeEntity", "BadgeEntity", "MilestoneEntity", "LibraryDataEntity", "LanguageContextEntity", "LanguageEntity", "LanguageActiveDictionaryJoin", "LanguageAvailableDictionaryJoin", "LanguageDictionaryLocaleJoin", "LibraryShelfAndContentJoin", "LibraryShelfEntity", "PlaylistEntity", "PlaylistAndLessonsJoin", "TranslationsEntity", "TtsVoiceEntity", "LanguageAndTtsVoicesJoin", "TtsUtteranceEntity", "TranslationSentenceEntity", "LanguageProgressEntity", "PagingKeysEntity", "LanguageProgressChartEntryEntity", "StudyStatsEntity", "LessonBookmarkEntity", "LibraryCounterEntity", "TokenPopularMeaningsEntity", "TokenRelatedPhrasesEntity", "LibraryDownloadEntity", "LessonAudioDownloadEntity", "LanguageCardsTagsEntity", "CourseForImportEntity", "LessonsWithPlaylistJoin", "CoursesAndLessonsJoin", "CoursesAndLanguageJoin", "CourseAndCardsJoin", "ChallengeRankingEntity", "ChallengeDetailStatsEntity", "ChallengeStatsEntity", "ProviderEntity", "LessonTagEntity", "NotificationEntity", "StreakEntity", "MilestoneMetEntity", "MilestoneStatsEntity", "LibraryFastSearchEntity", "SharedByUserEntity", "SharedByUserAndQueryJoin", "NoticeEntity", "ReferralEntity", "LessonStatsEntity", "CardsAndLOTDJoin", "LessonAndCardsFromJoin", "LessonAndWordsFromJoin", "LessonsSimplifiedJoin", "CoursesAndLessonsSortJoin", "LessonNextSuggestionEntity", "SourceBlacklistEntity", "CourseBlacklistEntity", "TokenCwtEntity", "LanguageStatsEntity", "StatsCalendarEntity", "ChatHistoryEntity", "ChatStatsEntity", "ChatSuggestionEntity", "ChatLessonJoin", "SearchChatHistoryJoin", "ChatSentenceEntity", "ChatMessageTranslationEntity", "ChatMessagePhrasesEntity", "LessonPreviewEntity", "OfferEntity", "LessonAchievementEntity", "LessonSentenceTranslationEntity", "VocabularyOrderEntity", "LessonCoachChatEntity", "CupEntity", "CupPrizeEntity", "CupTeamEntity", "CupContributorEntity", "CupContributorMeEntity", "CollectionSubscriptionEntity");
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: e */
    public final List mo2832e(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        int i = 222;
        int i2 = 225;
        arrayList.add(new sy5(i, i2, 19));
        int i3 = 226;
        arrayList.add(new sy5(i, i3, 20));
        arrayList.add(new sy5(i2, i3, 21));
        int i4 = 227;
        arrayList.add(new sy5(i3, i4, 22));
        int i5 = 228;
        arrayList.add(new sy5(i4, i5, 23));
        int i6 = 229;
        arrayList.add(new sy5(i5, i6, 24));
        arrayList.add(new sy5(i6, 230, 25));
        arrayList.add(new md5(0));
        arrayList.add(new md5(1));
        int i7 = 234;
        arrayList.add(new sy5(233, i7, 26));
        int i8 = 235;
        arrayList.add(new sy5(i7, i8, 27));
        arrayList.add(new sy5(i8, 236, 28));
        arrayList.add(new md5(2));
        int i9 = 238;
        arrayList.add(new sy5(237, i9, 29));
        int i10 = 239;
        arrayList.add(new nd5(i9, i10, 0));
        int i11 = 240;
        arrayList.add(new nd5(i10, i11, 1));
        int i12 = 241;
        arrayList.add(new nd5(i11, i12, 2));
        int i13 = 242;
        arrayList.add(new nd5(i12, i13, 3));
        int i14 = 243;
        arrayList.add(new nd5(i13, i14, 4));
        arrayList.add(new nd5(i14, 244, 5));
        int i15 = 246;
        arrayList.add(new nd5(245, i15, 6));
        arrayList.add(new nd5(i15, 247, 7));
        int i16 = 249;
        arrayList.add(new nd5(248, i16, 8));
        int i17 = 250;
        arrayList.add(new nd5(i16, i17, 9));
        int i18 = 251;
        arrayList.add(new nd5(i17, i18, 10));
        int i19 = 252;
        arrayList.add(new nd5(i18, i19, 11));
        arrayList.add(new nd5(i19, 253, 12));
        int i20 = 254;
        arrayList.add(new nd5(i20, 255, 13));
        int i21 = 256;
        arrayList.add(new nd5(i20, i21, 14));
        int i22 = 257;
        arrayList.add(new nd5(i21, i22, 15));
        int i23 = 258;
        arrayList.add(new nd5(i22, i23, 16));
        int i24 = 259;
        arrayList.add(new nd5(i23, i24, 17));
        int i25 = 260;
        arrayList.add(new nd5(i24, i25, 18));
        int i26 = 261;
        arrayList.add(new nd5(i25, i26, 19));
        int i27 = 262;
        arrayList.add(new nd5(i26, i27, 20));
        int i28 = 263;
        arrayList.add(new nd5(i27, i28, 21));
        int i29 = 264;
        arrayList.add(new nd5(i28, i29, 22));
        int i30 = 265;
        arrayList.add(new nd5(i29, i30, 23));
        arrayList.add(new nd5(i30, 266, 24));
        arrayList.add(new md5(3));
        int i31 = 268;
        arrayList.add(new nd5(267, i31, 25));
        int i32 = 269;
        arrayList.add(new nd5(i31, i32, 26));
        int i33 = 270;
        arrayList.add(new nd5(i32, i33, 27));
        int i34 = 271;
        arrayList.add(new nd5(i33, i34, 28));
        int i35 = 272;
        arrayList.add(new nd5(i34, i35, 29));
        int i36 = 273;
        arrayList.add(new od5(i35, i36, 0));
        int i37 = 274;
        arrayList.add(new od5(i36, i37, 1));
        int i38 = 275;
        arrayList.add(new od5(i37, i38, 2));
        int i39 = 276;
        arrayList.add(new od5(i38, i39, 3));
        arrayList.add(new od5(i39, 277, 4));
        arrayList.add(new md5(4));
        int i40 = 279;
        arrayList.add(new od5(278, i40, 5));
        arrayList.add(new od5(i40, 280, 6));
        int i41 = 282;
        arrayList.add(new od5(281, i41, 7));
        int i42 = 283;
        arrayList.add(new od5(i41, i42, 8));
        int i43 = 284;
        arrayList.add(new od5(i42, i43, 9));
        arrayList.add(new od5(i43, 285, 10));
        arrayList.add(new md5(5));
        int i44 = 288;
        arrayList.add(new od5(287, i44, 11));
        arrayList.add(new od5(i44, 289, 12));
        arrayList.add(new od5(289, 290, 13));
        arrayList.add(new od5(290, 291, 14));
        arrayList.add(new od5(291, 292, 15));
        arrayList.add(new od5(292, 293, 16));
        arrayList.add(new od5(293, 294, 17));
        arrayList.add(new od5(294, 295, 18));
        arrayList.add(new od5(295, 296, 19));
        arrayList.add(new od5(296, 297, 20));
        arrayList.add(new od5(297, 298, 21));
        arrayList.add(new od5(298, 299, 22));
        arrayList.add(new od5(299, 300, 23));
        arrayList.add(new od5(300, 301, 24));
        arrayList.add(new od5(301, 302, 25));
        arrayList.add(new od5(302, 303, 26));
        arrayList.add(new od5(303, 304, 27));
        arrayList.add(new od5(305, 306, 28));
        arrayList.add(new od5(306, 307, 29));
        arrayList.add(new pd5(307, 308, 0));
        arrayList.add(new pd5(308, 309, 1));
        arrayList.add(new pd5(309, 310, 2));
        arrayList.add(new pd5(310, 311, 3));
        return arrayList;
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: f */
    public final C0736a mo2833f() {
        return new C0736a(this, new LinkedHashMap(), new LinkedHashMap(), "LessonEntity", "LessonSentenceEntity", "CardEntity", "WordEntity", "LessonsAndCardsJoin", "LessonsAndWordsJoin", "DictionaryDataEntity", "DictionaryLocaleEntity", "ChallengeEntity", "BadgeEntity", "MilestoneEntity", "LibraryDataEntity", "LanguageContextEntity", "LanguageEntity", "LanguageActiveDictionaryJoin", "LanguageAvailableDictionaryJoin", "LanguageDictionaryLocaleJoin", "LibraryShelfAndContentJoin", "LibraryShelfEntity", "PlaylistEntity", "PlaylistAndLessonsJoin", "TranslationsEntity", "TtsVoiceEntity", "LanguageAndTtsVoicesJoin", "TtsUtteranceEntity", "TranslationSentenceEntity", "LanguageProgressEntity", "PagingKeysEntity", "LanguageProgressChartEntryEntity", "StudyStatsEntity", "LessonBookmarkEntity", "LibraryCounterEntity", "TokenPopularMeaningsEntity", "TokenRelatedPhrasesEntity", "LibraryDownloadEntity", "LessonAudioDownloadEntity", "LanguageCardsTagsEntity", "CourseForImportEntity", "LessonsWithPlaylistJoin", "CoursesAndLessonsJoin", "CoursesAndLanguageJoin", "CourseAndCardsJoin", "ChallengeRankingEntity", "ChallengeDetailStatsEntity", "ChallengeStatsEntity", "ProviderEntity", "LessonTagEntity", "NotificationEntity", "StreakEntity", "MilestoneMetEntity", "MilestoneStatsEntity", "LibraryFastSearchEntity", "SharedByUserEntity", "SharedByUserAndQueryJoin", "NoticeEntity", "ReferralEntity", "LessonStatsEntity", "CardsAndLOTDJoin", "LessonAndCardsFromJoin", "LessonAndWordsFromJoin", "LessonsSimplifiedJoin", "CoursesAndLessonsSortJoin", "LessonNextSuggestionEntity", "SourceBlacklistEntity", "CourseBlacklistEntity", "TokenCwtEntity", "LanguageStatsEntity", "StatsCalendarEntity", "ChatHistoryEntity", "ChatStatsEntity", "ChatSuggestionEntity", "ChatLessonJoin", "SearchChatHistoryJoin", "ChatSentenceEntity", "ChatMessageTranslationEntity", "ChatMessagePhrasesEntity", "LessonPreviewEntity", "OfferEntity", "LessonAchievementEntity", "LessonSentenceTranslationEntity", "VocabularyOrderEntity", "LessonCoachChatEntity", "CupEntity", "CupPrizeEntity", "CupTeamEntity", "CupContributorEntity", "CupContributorMeEntity", "CollectionSubscriptionEntity");
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: g */
    public final lq2 mo2834g() {
        return new rd5(this);
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: k */
    public final Set mo2838k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.AbstractC0746d
    /* JADX INFO: renamed from: l */
    public final LinkedHashMap mo2839l() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z21 z21VarM24933a = y38.m24933a(C1321i.class);
        C1321i.Companion.getClass();
        EmptyList emptyList = EmptyList.f47638a;
        linkedHashMap.put(z21VarM24933a, emptyList);
        z21 z21VarM24933a2 = y38.m24933a(AbstractC1320h.class);
        q05.Companion.getClass();
        linkedHashMap.put(z21VarM24933a2, emptyList);
        z21 z21VarM24933a3 = y38.m24933a(io1.class);
        io1.Companion.getClass();
        linkedHashMap.put(z21VarM24933a3, emptyList);
        z21 z21VarM24933a4 = y38.m24933a(C1316d.class);
        C1316d.Companion.getClass();
        linkedHashMap.put(z21VarM24933a4, emptyList);
        z21 z21VarM24933a5 = y38.m24933a(C1317e.class);
        C1317e.Companion.getClass();
        linkedHashMap.put(z21VarM24933a5, emptyList);
        z21 z21VarM24933a6 = y38.m24933a(un0.class);
        un0.Companion.getClass();
        linkedHashMap.put(z21VarM24933a6, emptyList);
        z21 z21VarM24933a7 = y38.m24933a(o7b.class);
        o7b.Companion.getClass();
        linkedHashMap.put(z21VarM24933a7, emptyList);
        z21 z21VarM24933a8 = y38.m24933a(v3a.class);
        v3a.Companion.getClass();
        linkedHashMap.put(z21VarM24933a8, emptyList);
        z21 z21VarM24933a9 = y38.m24933a(ul4.class);
        ul4.Companion.getClass();
        linkedHashMap.put(z21VarM24933a9, emptyList);
        z21 z21VarM24933a10 = y38.m24933a(C1319g.class);
        C1319g.Companion.getClass();
        linkedHashMap.put(z21VarM24933a10, emptyList);
        z21 z21VarM24933a11 = y38.m24933a(C1322j.class);
        C1322j.Companion.getClass();
        linkedHashMap.put(z21VarM24933a11, emptyList);
        z21 z21VarM24933a12 = y38.m24933a(AbstractC1323k.class);
        rxa.Companion.getClass();
        linkedHashMap.put(z21VarM24933a12, emptyList);
        z21 z21VarM24933a13 = y38.m24933a(C1318f.class);
        C1318f.Companion.getClass();
        linkedHashMap.put(z21VarM24933a13, emptyList);
        z21 z21VarM24933a14 = y38.m24933a(wi5.class);
        wi5.Companion.getClass();
        linkedHashMap.put(z21VarM24933a14, emptyList);
        z21 z21VarM24933a15 = y38.m24933a(zca.class);
        zca.Companion.getClass();
        linkedHashMap.put(z21VarM24933a15, emptyList);
        z21 z21VarM24933a16 = y38.m24933a(x27.class);
        x27.Companion.getClass();
        linkedHashMap.put(z21VarM24933a16, emptyList);
        z21 z21VarM24933a17 = y38.m24933a(yp0.class);
        yp0.Companion.getClass();
        linkedHashMap.put(z21VarM24933a17, emptyList);
        z21 z21VarM24933a18 = y38.m24933a(dn6.class);
        dn6.Companion.getClass();
        linkedHashMap.put(z21VarM24933a18, emptyList);
        z21 z21VarM24933a19 = y38.m24933a(uy5.class);
        uy5.Companion.getClass();
        linkedHashMap.put(z21VarM24933a19, emptyList);
        z21 z21VarM24933a20 = y38.m24933a(np8.class);
        np8.Companion.getClass();
        linkedHashMap.put(z21VarM24933a20, emptyList);
        z21 z21VarM24933a21 = y38.m24933a(lm6.class);
        lm6.Companion.getClass();
        linkedHashMap.put(z21VarM24933a21, emptyList);
        z21 z21VarM24933a22 = y38.m24933a(xp6.class);
        xp6.Companion.getClass();
        linkedHashMap.put(z21VarM24933a22, emptyList);
        z21 z21VarM24933a23 = y38.m24933a(u38.class);
        u38.Companion.getClass();
        linkedHashMap.put(z21VarM24933a23, emptyList);
        z21 z21VarM24933a24 = y38.m24933a(C1314b.class);
        C1314b.Companion.getClass();
        linkedHashMap.put(z21VarM24933a24, emptyList);
        z21 z21VarM24933a25 = y38.m24933a(C1313a.class);
        C1313a.Companion.getClass();
        linkedHashMap.put(z21VarM24933a25, emptyList);
        z21 z21VarM24933a26 = y38.m24933a(C1315c.class);
        C1315c.Companion.getClass();
        linkedHashMap.put(z21VarM24933a26, emptyList);
        z21 z21VarM24933a27 = y38.m24933a(hx4.class);
        hx4.Companion.getClass();
        linkedHashMap.put(z21VarM24933a27, emptyList);
        return linkedHashMap;
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: u */
    public final C1313a mo7453u() {
        return (C1313a) this.f16826J.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: v */
    public final C1314b mo7454v() {
        return (C1314b) this.f16825I.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: w */
    public final un0 mo7455w() {
        return (un0) this.f16834q.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: x */
    public final yp0 mo7456x() {
        return (yp0) this.f16818B.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: y */
    public final C1315c mo7457y() {
        return (C1315c) this.f16827K.getValue();
    }

    @Override // com.lingq.core.database.LingQDatabase
    /* JADX INFO: renamed from: z */
    public final C1316d mo7458z() {
        return (C1316d) this.f16832o.getValue();
    }
}
