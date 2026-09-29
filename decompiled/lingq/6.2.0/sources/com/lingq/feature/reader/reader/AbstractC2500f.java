package com.lingq.feature.reader.reader;

import androidx.lifecycle.Lifecycle$Event;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2500f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f30281a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f30282b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f30283c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f30284d;

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
        f30281a = iArr;
        int[] iArr2 = new int[SidePanelContent.values().length];
        try {
            iArr2[SidePanelContent.TokenPopup.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SidePanelContent.Vocabulary.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SidePanelContent.Empty.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f30282b = iArr2;
        int[] iArr3 = new int[TooltipStep.values().length];
        try {
            iArr3[TooltipStep.TapBlueWord.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[TooltipStep.SentenceModeHighlight.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TooltipStep.PlayAudioHighlight.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f30283c = iArr3;
        int[] iArr4 = new int[InAppNotificationType.values().length];
        try {
            iArr4[InAppNotificationType.DailyGoal.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[InAppNotificationType.DailyGoalDouble.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[InAppNotificationType.Milestone.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f30284d = iArr4;
    }
}
