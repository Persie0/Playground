package p353r2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p471x2.AbstractC10028b;

/* JADX INFO: renamed from: r2.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC8725b extends MenuItem {
    /* JADX INFO: renamed from: a */
    AbstractC10028b mo945a();

    /* JADX INFO: renamed from: b */
    InterfaceMenuItemC8725b mo946b(AbstractC10028b abstractC10028b);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC8725b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override // android.view.MenuItem
    InterfaceMenuItemC8725b setTooltipText(CharSequence charSequence);
}
