package com.google.android.datatransport.cct;

import android.content.Context;
import p000.eba;
import p000.i40;
import p000.mo0;
import p000.mr1;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory {
    public eba create(mr1 mr1Var) {
        Context context = ((i40) mr1Var).f43470a;
        i40 i40Var = (i40) mr1Var;
        return new mo0(context, i40Var.f43471b, i40Var.f43472c);
    }
}
