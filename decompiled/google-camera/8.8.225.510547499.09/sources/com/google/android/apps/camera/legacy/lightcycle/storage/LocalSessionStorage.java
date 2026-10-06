package com.google.android.apps.camera.legacy.lightcycle.storage;

import java.io.Serializable;
import p000.gxx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class LocalSessionStorage implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f6800a;

    /* JADX INFO: renamed from: b */
    public gxx f6801b;

    /* JADX INFO: renamed from: c */
    public String f6802c;

    /* JADX INFO: renamed from: d */
    public String f6803d;

    /* JADX INFO: renamed from: e */
    public String f6804e;

    /* JADX INFO: renamed from: f */
    public String f6805f;

    /* JADX INFO: renamed from: g */
    public String f6806g;

    /* JADX INFO: renamed from: h */
    public String f6807h;

    /* JADX INFO: renamed from: i */
    public String f6808i;

    /* JADX INFO: renamed from: j */
    public int f6809j;

    public final String toString() {
        return "Session ID : " + this.f6800a + "\n BaseDir : " + this.f6802c + "\n sessionRelativeDir : " + this.f6805f + "\n SessionBaseDir : " + this.f6803d + "\n SessionDir : " + this.f6804e + "\n thumbnail : " + this.f6806g + "\n metadata : " + this.f6807h + "\n orientationFile : " + this.f6808i;
    }
}
