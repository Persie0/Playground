package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.ShotMetadata;
import p000.mrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface LasagnaCallbacks {
    /* JADX INFO: renamed from: a */
    void mo5159a(int i, int i2, String str, mrm mrmVar);

    /* JADX INFO: renamed from: e */
    void mo5160e(int i, long j, int i2, String str, ShotMetadata shotMetadata);

    void onFinalStatusNative(int i, int i2, String str, byte[] bArr);

    void onImageNative(int i, long j, int i2, String str, long j2);

    void onProgress(int i, float f);

    void onPslRequest(int i, boolean z, float f, float f2);
}
