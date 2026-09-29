package p000;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class d88 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f35180a;

    /* JADX INFO: renamed from: b */
    public final Configuration f35181b;

    /* JADX INFO: renamed from: c */
    public final int f35182c;

    public d88(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f35180a = colorStateList;
        this.f35181b = configuration;
        this.f35182c = theme == null ? 0 : theme.hashCode();
    }
}
