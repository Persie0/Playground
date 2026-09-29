package p000;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r97 {
    /* JADX INFO: renamed from: a */
    public static void m20453a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: b */
    public static PlaybackState.CustomAction m20454b(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static PlaybackState m20455c(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static PlaybackState.Builder m20456d() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static PlaybackState.CustomAction.Builder m20457e(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: renamed from: f */
    public static String m20458f(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: g */
    public static long m20459g(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: h */
    public static long m20460h(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: i */
    public static long m20461i(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: j */
    public static List<PlaybackState.CustomAction> m20462j(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m20463k(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m20464l(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: m */
    public static int m20465m(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* JADX INFO: renamed from: n */
    public static long m20466n(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m20467o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: p */
    public static float m20468p(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: q */
    public static long m20469q(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: r */
    public static int m20470r(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: s */
    public static void m20471s(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: renamed from: t */
    public static void m20472t(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: renamed from: u */
    public static void m20473u(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: renamed from: v */
    public static void m20474v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static void m20475w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: x */
    public static void m20476x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }
}
