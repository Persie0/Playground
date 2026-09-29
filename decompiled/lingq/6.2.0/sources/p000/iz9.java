package p000;

import com.lingq.core.domain.model.theme.ColorSchemeName;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class iz9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44810a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f44811b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f44812c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f44813d;

    static {
        int[] iArr = new int[ThemeSettingsTab.values().length];
        try {
            iArr[ThemeSettingsTab.Theme.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ThemeSettingsTab.Font.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ThemeSettingsTab.Reading.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ThemeSettingsTab.Script.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f44810a = iArr;
        int[] iArr2 = new int[LqTheme.values().length];
        try {
            iArr2[LqTheme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LqTheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f44811b = iArr2;
        int[] iArr3 = new int[ColorSchemeName.values().length];
        try {
            iArr3[ColorSchemeName.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ColorSchemeName.Yellow.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f44812c = iArr3;
        int[] iArr4 = new int[TextHighlightStyle.values().length];
        try {
            iArr4[TextHighlightStyle.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[TextHighlightStyle.Underlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[TextHighlightStyle.ForegroundColor.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[TextHighlightStyle.Off.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        f44813d = iArr4;
    }
}
