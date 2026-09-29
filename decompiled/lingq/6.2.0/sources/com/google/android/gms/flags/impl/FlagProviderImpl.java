package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import p000.by3;
import p000.eed;
import p000.fwb;
import p000.jdd;
import p000.lp6;
import p000.njb;

/* JADX INFO: loaded from: classes2.dex */
public class FlagProviderImpl extends fwb {

    /* JADX INFO: renamed from: f */
    public boolean f11774f;

    /* JADX INFO: renamed from: g */
    public SharedPreferences f11775g;

    public FlagProviderImpl() {
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        this.f11774f = false;
    }

    @Override // p000.wrb
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f11774f) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f11775g;
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            boolValueOf = (Boolean) jdd.m14413c(new njb(sharedPreferences, str, boolValueOf, 3));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // p000.wrb
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f11774f) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f11775g;
        Integer numValueOf = Integer.valueOf(i);
        try {
            numValueOf = (Integer) jdd.m14413c(new njb(sharedPreferences, str, numValueOf, 4));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // p000.wrb
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f11774f) {
            return j;
        }
        SharedPreferences sharedPreferences = this.f11775g;
        Long lValueOf = Long.valueOf(j);
        try {
            lValueOf = (Long) jdd.m14413c(new njb(sharedPreferences, str, lValueOf, 5));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // p000.wrb
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f11774f) {
            return str2;
        }
        try {
            return (String) jdd.m14413c(new njb(this.f11775g, str, str2, 6));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // p000.wrb
    public void init(by3 by3Var) {
        Context context = (Context) lp6.m16422I(by3Var);
        if (this.f11774f) {
            return;
        }
        try {
            this.f11775g = eed.m11084b(context.createPackageContext("com.google.android.gms", 0));
            this.f11774f = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
