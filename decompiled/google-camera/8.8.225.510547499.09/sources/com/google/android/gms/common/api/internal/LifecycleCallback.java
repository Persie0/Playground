package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import p000.jfs;
import p000.jft;
import p000.jib;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: f */
    public final jft f7622f;

    protected LifecycleCallback(jft jftVar) {
        this.f7622f = jftVar;
    }

    private static jft getChimeraLifecycleFragmentImpl(jfs jfsVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* JADX INFO: renamed from: c */
    public void mo4653c(int i, int i2, Intent intent) {
    }

    /* JADX INFO: renamed from: d */
    public void mo4654d(Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    public void mo4655g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public void mo4656h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo4657i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo4658j() {
    }

    /* JADX INFO: renamed from: l */
    public final Activity m4659l() {
        Activity activityMo13117a = this.f7622f.mo13117a();
        jib.m13205j(activityMo13117a);
        return activityMo13117a;
    }
}
