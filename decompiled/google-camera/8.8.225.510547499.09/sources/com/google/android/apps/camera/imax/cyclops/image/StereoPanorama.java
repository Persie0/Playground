package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class StereoPanorama {

    /* JADX INFO: renamed from: a */
    public final byte[] f6738a;

    /* JADX INFO: renamed from: b */
    public final byte[] f6739b;

    /* JADX INFO: renamed from: c */
    public final PanoMeta f6740c;

    /* JADX INFO: renamed from: d */
    public AudioTrack f6741d;

    public StereoPanorama(byte[] bArr, byte[] bArr2, PanoMeta panoMeta) {
        this(bArr, bArr2, panoMeta, null);
    }

    public StereoPanorama(byte[] bArr, byte[] bArr2, PanoMeta panoMeta, AudioTrack audioTrack) {
        this.f6738a = bArr;
        this.f6739b = bArr2;
        this.f6740c = panoMeta;
        this.f6741d = audioTrack;
    }
}
