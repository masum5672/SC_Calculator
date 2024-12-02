package com.orbitalsonic.scientificcalculator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0003J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012H\u0003J\b\u0010\u0019\u001a\u00020\u0010H\u0003J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0003J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&J\u0012\u0010\'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0010H\u0002J\u000e\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0012J&\u00101\u001a\b\u0012\u0004\u0012\u00020302*\u0004\u0018\u00010\u00122\u0006\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/orbitalsonic/scientificcalculator/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/orbitalsonic/scientificcalculator/databinding/ActivityMainBinding;", "getBinding", "()Lcom/orbitalsonic/scientificcalculator/databinding/ActivityMainBinding;", "setBinding", "(Lcom/orbitalsonic/scientificcalculator/databinding/ActivityMainBinding;)V", "isDegreeEnable", "", "isScientificCalculator", "isSecondEnable", "scriptEngine", "Ljavax/script/ScriptEngine;", "addOperands", "", "operands", "", "addTextCalculate", "mData", "angleConverter", "angle", "calculate", "input", "changingDegree", "changingSecond", "clearTextAll", "cleatTextLast", "equalClicked", "handlingLengthyResult", "number", "isDigit", "ch", "", "isOperands", "onClickMethod", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "replaceOperations", "setScreen", "percentage", "", "setVisibilityScientific", "showMessage", "message", "indexesOf", "", "", "substr", "ignoreCase", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.orbitalsonic.scientificcalculator.databinding.ActivityMainBinding binding;
    private boolean isScientificCalculator = false;
    private boolean isSecondEnable = true;
    private boolean isDegreeEnable = true;
    private javax.script.ScriptEngine scriptEngine;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.orbitalsonic.scientificcalculator.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.orbitalsonic.scientificcalculator.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onClickMethod(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    private final void setScreen(double percentage) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void addOperands(java.lang.String operands) {
    }
    
    private final boolean isOperands(java.lang.String operands) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void addTextCalculate(java.lang.String mData) {
    }
    
    private final void clearTextAll() {
    }
    
    private final void cleatTextLast() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void equalClicked() {
    }
    
    private final void setVisibilityScientific() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void calculate(java.lang.String input) {
    }
    
    private final java.lang.String handlingLengthyResult(java.lang.String number) {
        return null;
    }
    
    private final java.lang.String replaceOperations(java.lang.String input) {
        return null;
    }
    
    private final void changingSecond() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void changingDegree() {
    }
    
    private final java.util.List<java.lang.Integer> indexesOf(java.lang.String $this$indexesOf, java.lang.String substr, boolean ignoreCase) {
        return null;
    }
    
    private final boolean isDigit(char ch) {
        return false;
    }
    
    private final java.lang.String angleConverter(java.lang.String angle) {
        return null;
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}