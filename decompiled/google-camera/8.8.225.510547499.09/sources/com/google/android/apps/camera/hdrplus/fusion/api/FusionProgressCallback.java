package com.google.android.apps.camera.hdrplus.fusion.api;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import p000.ihk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface FusionProgressCallback {
    /* JADX INFO: renamed from: a */
    void mo4179a(long j, int i, int i2, boolean z);

    /* JADX INFO: renamed from: b */
    void mo4180b(long j, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata);

    /* JADX INFO: renamed from: c */
    void mo4181c(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, String str);

    /* JADX INFO: renamed from: d */
    void mo4182d(long j, ihk ihkVar, ShotMetadata shotMetadata);

    void onProgress(long j, float f);
}
