package p000;

import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface gpu {
    /* JADX INFO: renamed from: c */
    void mo9604c();

    /* JADX INFO: renamed from: d */
    void mo9605d();

    /* JADX INFO: renamed from: e */
    nps mo9606e(long j, InterleavedImageU8 interleavedImageU8, InterleavedImageU16 interleavedImageU16, fvu fvuVar, PortraitRequest portraitRequest, RawReadView rawReadView, ShotMetadata shotMetadata, RawReadView rawReadView2, ShotMetadata shotMetadata2, ehn ehnVar);
}
