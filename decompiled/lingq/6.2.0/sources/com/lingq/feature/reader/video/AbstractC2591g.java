package com.lingq.feature.reader.video;

import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: renamed from: com.lingq.feature.reader.video.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2591g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f31453a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f31454b;

    static {
        int[] iArr = new int[Lifecycle$Event.values().length];
        try {
            iArr[Lifecycle$Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle$Event.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f31453a = iArr;
        int[] iArr2 = new int[VideoSidePanelContent.values().length];
        try {
            iArr2[VideoSidePanelContent.TokenPopup.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[VideoSidePanelContent.Vocabulary.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f31454b = iArr2;
    }
}
