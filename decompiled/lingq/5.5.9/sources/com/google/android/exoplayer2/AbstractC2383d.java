package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2383d implements InterfaceC2532v {

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0.c f12103a = new AbstractC2382c0.c();

    /* JADX INFO: renamed from: a */
    public abstract void mo6921a(int i10, long j10, boolean z10);

    public final void addMediaItem(int i10, C2466p c2466p) {
        ((C2413j) this).addMediaItems(i10, ImmutableList.m9064b0(c2466p));
    }

    public final void addMediaItem(C2466p c2466p) {
        addMediaItems(ImmutableList.m9064b0(c2466p));
    }

    public final void addMediaItems(List<C2466p> list) {
        ((C2413j) this).addMediaItems(Integer.MAX_VALUE, list);
    }

    /* JADX INFO: renamed from: b */
    public final void m6922b(int i10, long j10) {
        mo6921a(((C2413j) this).getCurrentMediaItemIndex(), j10, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m6923c(int i10, int i11) {
        mo6921a(i10, -9223372036854775807L, false);
    }

    public final boolean canAdvertiseSession() {
        return true;
    }

    public final void clearMediaItems() {
        ((C2413j) this).removeMediaItems(0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: d */
    public final void m6924d(int i10, long j10) {
        C2413j c2413j = (C2413j) this;
        long currentPosition = c2413j.getCurrentPosition() + j10;
        long duration = c2413j.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m6922b(i10, Math.max(currentPosition, 0L));
    }

    /* JADX INFO: renamed from: e */
    public final void m6925e(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        C2413j c2413j = (C2413j) this;
        if (previousMediaItemIndex == c2413j.getCurrentMediaItemIndex()) {
            mo6921a(c2413j.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            m6923c(previousMediaItemIndex, i10);
        }
    }

    public final int getBufferedPercentage() {
        C2413j c2413j = (C2413j) this;
        long bufferedPosition = c2413j.getBufferedPosition();
        long duration = c2413j.getDuration();
        int iM19041h = 0;
        if (bufferedPosition != -9223372036854775807L) {
            if (duration == -9223372036854775807L) {
                return 0;
            }
            if (duration == 0) {
                return 100;
            }
            iM19041h = C10134c0.m19041h((int) ((bufferedPosition * 100) / duration), 0, 100);
        }
        return iM19041h;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final long getContentDuration() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return -9223372036854775807L;
        }
        return C10134c0.m19033R(currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).f12087I);
    }

    public final long getCurrentLiveOffset() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return -9223372036854775807L;
        }
        int currentMediaItemIndex = c2413j.getCurrentMediaItemIndex();
        AbstractC2382c0.c cVar = this.f12103a;
        if (currentTimeline.m6908m(currentMediaItemIndex, cVar).f12096f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = cVar.f12097g;
        return ((j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime()) - cVar.f12096f) - c2413j.getContentPosition();
    }

    public final Object getCurrentManifest() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return null;
        }
        return currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).f12094d;
    }

    public final C2466p getCurrentMediaItem() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return null;
        }
        return currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).f12093c;
    }

    @Deprecated
    public final int getCurrentWindowIndex() {
        return ((C2413j) this).getCurrentMediaItemIndex();
    }

    public final C2466p getMediaItemAt(int i10) {
        return ((C2413j) this).getCurrentTimeline().m6908m(i10, this.f12103a).f12093c;
    }

    public final int getMediaItemCount() {
        return ((C2413j) this).getCurrentTimeline().mo6909o();
    }

    public final int getNextMediaItemIndex() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return -1;
        }
        int currentMediaItemIndex = c2413j.getCurrentMediaItemIndex();
        c2413j.m7021D();
        int i10 = c2413j.f12273F;
        if (i10 == 1) {
            i10 = 0;
        }
        c2413j.m7021D();
        return currentTimeline.mo6776e(currentMediaItemIndex, i10, c2413j.f12274G);
    }

    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    public final int getPreviousMediaItemIndex() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        if (currentTimeline.m6910p()) {
            return -1;
        }
        int currentMediaItemIndex = c2413j.getCurrentMediaItemIndex();
        c2413j.m7021D();
        int i10 = c2413j.f12273F;
        if (i10 == 1) {
            i10 = 0;
        }
        c2413j.m7021D();
        return currentTimeline.mo6779k(currentMediaItemIndex, i10, c2413j.f12274G);
    }

    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isCommandAvailable(int i10) {
        C2413j c2413j = (C2413j) this;
        c2413j.m7021D();
        return c2413j.f12283P.f13754a.f51380a.get(i10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isCurrentMediaItemDynamic() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        return !currentTimeline.m6910p() && currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).f12099i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isCurrentMediaItemLive() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        return !currentTimeline.m6910p() && currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).m6919a();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isCurrentMediaItemSeekable() {
        C2413j c2413j = (C2413j) this;
        AbstractC2382c0 currentTimeline = c2413j.getCurrentTimeline();
        return !currentTimeline.m6910p() && currentTimeline.m6908m(c2413j.getCurrentMediaItemIndex(), this.f12103a).f12098h;
    }

    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final boolean isPlaying() {
        C2413j c2413j = (C2413j) this;
        return c2413j.getPlaybackState() == 3 && c2413j.getPlayWhenReady() && c2413j.getPlaybackSuppressionReason() == 0;
    }

    public final void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            ((C2413j) this).moveMediaItems(i10, i10 + 1, i11);
        }
    }

    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void pause() {
        ((C2413j) this).setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void play() {
        ((C2413j) this).setPlayWhenReady(true);
    }

    @Deprecated
    public final void previous() {
        m6925e(6);
    }

    public final void removeMediaItem(int i10) {
        ((C2413j) this).removeMediaItems(i10, i10 + 1);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekBack() {
        C2413j c2413j = (C2413j) this;
        c2413j.m7021D();
        m6924d(11, -c2413j.f12333u);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekForward() {
        C2413j c2413j = (C2413j) this;
        c2413j.m7021D();
        m6924d(12, c2413j.f12335v);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekTo(int i10, long j10) {
        mo6921a(i10, j10, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekTo(long j10) {
        m6922b(5, j10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekToDefaultPosition() {
        m6923c(((C2413j) this).getCurrentMediaItemIndex(), 4);
    }

    public final void seekToDefaultPosition(int i10) {
        m6923c(i10, 10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekToNext() {
        C2413j c2413j = (C2413j) this;
        if (!c2413j.getCurrentTimeline().m6910p() && !c2413j.isPlayingAd()) {
            if (!hasNextMediaItem()) {
                if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                    m6923c(c2413j.getCurrentMediaItemIndex(), 9);
                    return;
                }
                return;
            }
            int nextMediaItemIndex = getNextMediaItemIndex();
            if (nextMediaItemIndex == -1) {
                return;
            }
            if (nextMediaItemIndex == c2413j.getCurrentMediaItemIndex()) {
                mo6921a(c2413j.getCurrentMediaItemIndex(), -9223372036854775807L, true);
            } else {
                m6923c(nextMediaItemIndex, 9);
            }
        }
    }

    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        C2413j c2413j = (C2413j) this;
        if (nextMediaItemIndex == c2413j.getCurrentMediaItemIndex()) {
            mo6921a(c2413j.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            m6923c(nextMediaItemIndex, 8);
        }
    }

    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2532v
    public final void seekToPrevious() {
        C2413j c2413j = (C2413j) this;
        if (c2413j.getCurrentTimeline().m6910p() || c2413j.isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                m6925e(7);
                return;
            }
            return;
        }
        if (zHasPreviousMediaItem) {
            long currentPosition = c2413j.getCurrentPosition();
            c2413j.getMaxSeekToPreviousPosition();
            if (currentPosition <= 3000) {
                m6925e(7);
                return;
            }
        }
        m6922b(7, 0L);
    }

    public final void seekToPreviousMediaItem() {
        m6925e(6);
    }

    @Deprecated
    public final void seekToPreviousWindow() {
        m6925e(6);
    }

    public final void setMediaItem(C2466p c2466p) {
        setMediaItems(ImmutableList.m9064b0(c2466p));
    }

    public final void setMediaItem(C2466p c2466p, long j10) {
        ((C2413j) this).setMediaItems(ImmutableList.m9064b0(c2466p), 0, j10);
    }

    public final void setMediaItem(C2466p c2466p, boolean z10) {
        ((C2413j) this).setMediaItems(ImmutableList.m9064b0(c2466p), z10);
    }

    public final void setMediaItems(List<C2466p> list) {
        ((C2413j) this).setMediaItems(list, true);
    }

    public final void setPlaybackSpeed(float f3) {
        C2413j c2413j = (C2413j) this;
        c2413j.setPlaybackParameters(new C2505u(f3, c2413j.getPlaybackParameters().f13475b));
    }
}
