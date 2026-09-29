package com.lingq.shared.p054di;

import android.content.Context;
import androidx.datastore.preferences.C0799a;
import dm.C5209i;
import dm.C5212l;
import km.InterfaceC6727j;
import kotlin.jvm.internal.PropertyReference2Impl;
import p129g3.InterfaceC5687d;

/* JADX INFO: loaded from: classes.dex */
public final class SharedModule {

    /* JADX INFO: renamed from: a */
    public static final SharedModule f17759a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f17760b = {C5209i.f33277a.mo11127g(new PropertyReference2Impl())};

    /* JADX INFO: renamed from: c */
    public static final C0799a f17761c;

    static {
        SharedModule sharedModule = new SharedModule();
        f17759a = sharedModule;
        f17761c = C5212l.m11161h0(new SharedModule$dataStore$2(sharedModule));
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5687d m9434a(Context context) {
        return (InterfaceC5687d) f17761c.m3043a(context, f17760b[0]);
    }
}
